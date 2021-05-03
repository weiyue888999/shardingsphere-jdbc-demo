package io.weiyue.mapper;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shardingsphere.driver.api.ShardingSphereDataSourceFactory;
import org.apache.shardingsphere.infra.config.RuleConfiguration;
import org.apache.shardingsphere.sharding.api.config.ShardingRuleConfiguration;
import org.apache.shardingsphere.sharding.api.config.rule.ShardingTableRuleConfiguration;
import org.apache.shardingsphere.sharding.api.config.strategy.keygen.KeyGenerateStrategyConfiguration;
import org.apache.shardingsphere.sharding.api.config.strategy.sharding.StandardShardingStrategyConfiguration;
import org.apache.shardingsphere.sharding.route.engine.type.broadcast.ShardingTableBroadcastRoutingEngine;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class JavaConfigTestCase {

    @Test
    public void test(){

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("Xiaomo@xiaomo");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/shardingsphere-jdbc-demo");

        Map<String, DataSource> dataSourceMap = new HashMap<>();
        dataSourceMap.put("demo_ds",dataSource);

        //配置集合
        Collection<RuleConfiguration> configurations = new ArrayList<>();

        {
            //t_user表的配置
            ShardingTableRuleConfiguration shardingTableRuleConfiguration = new ShardingTableRuleConfiguration("t_user","demo_ds.t_user_$->{0..3}");

            //主键生成策略
            shardingTableRuleConfiguration.setKeyGenerateStrategy(new KeyGenerateStrategyConfiguration("id","SNOWFLAKE"));

            //表sharding
            shardingTableRuleConfiguration.setTableShardingStrategy(new StandardShardingStrategyConfiguration("id","sharding_t_user"));

            //数据库sharding
            shardingTableRuleConfiguration.setDatabaseShardingStrategy(new StandardShardingStrategyConfiguration("id","sharding_t_user"));

            ShardingRuleConfiguration shardingRuleConfiguration = new ShardingRuleConfiguration();
            shardingRuleConfiguration.getTables().add(shardingTableRuleConfiguration);
            configurations.add(shardingRuleConfiguration);
        }

        Properties props = new Properties();

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            DataSource shardingSphereDataSource = ShardingSphereDataSourceFactory.createDataSource(dataSourceMap, configurations, props);
            connection = shardingSphereDataSource.getConnection();
            ps = connection.prepareStatement("select count(*)  cnt from t_user where id = 593943121721561088");
            ps.execute();
            rs = ps.getResultSet();
            int cnt = rs.getInt("cnt");
            System.out.println(cnt);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
