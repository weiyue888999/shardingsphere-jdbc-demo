package io.weiyue.interceptors;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;

/**
 * 
**/
@Intercepts(//
		value = { //
				@Signature(//
						type = StatementHandler.class, //
						method = "query", //
						args = { Statement.class, ResultHandler.class }//
				) //
				, @Signature(//
						type = StatementHandler.class, //
						method = "prepare", //
						args = { Connection.class, Integer.class }//
				) //
				, @Signature(//
						type = StatementHandler.class, //
						method = "parameterize", //
						args = { Statement.class }//
				) //
				, @Signature(//
						type = StatementHandler.class, //
						method = "batch", //
						args = { Statement.class }//
				) //
				, @Signature(//
						type = StatementHandler.class, //
						method = "update", //
						args = { Statement.class }//
				) //
				, @Signature(//
						type = StatementHandler.class, //
						method = "queryCursor", //
						args = { Statement.class }//
				) //
				, @Signature(//
						type = StatementHandler.class, //
						method = "getBoundSql", //
						args = {}//
				) //
				, @Signature(//
						type = StatementHandler.class, //
						method = "getParameterHandler", //
						args = {}//
				) //
		}) //
public class DemoInterceptor implements Interceptor {

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
	}
}
