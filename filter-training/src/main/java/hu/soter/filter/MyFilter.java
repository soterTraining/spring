package hu.soter.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
	
public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		final String logMessage = String.format("Log: url called: [%s] with parameter(s): %s", extractContextPath(request), extractParamString(request));
		
		System.out.println(logMessage);
		
		chain.doFilter(request, response);
	}

	private String extractParamString(ServletRequest request) {
		final Map<String, String[]> parameterMap = request.getParameterMap();
		final String[] paramArray = new String[parameterMap.size()];
		int counter = 0;
		
		for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
			final String key = entry.getKey();
			final String[] value = entry.getValue();
			
			paramArray[counter++] = String.format("%s : %s", key, Arrays.toString(value));
		}
		
		return Arrays.toString(paramArray);
	}

	private Object extractContextPath(ServletRequest request) {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		return httpServletRequest.getRequestURI();
	}

	/*
	private String extractParamString(ServletRequest request) {
		final StringBuilder paramString = new StringBuilder();
		
		final Enumeration<String> parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()) {
			final String key = parameterNames.nextElement();
			final String[] value = request.getParameterValues(key);
			
			paramString.append(String.format("%s : %s,", key, Arrays.toString(value)));
		}
		
		
		final int paramStringLength = paramString.length();
		if (paramString.length() > 0) {
			paramString.delete(paramStringLength-1, paramStringLength);
		}
		
		return paramString.toString();
	}*/

	@Override
	public void destroy() {
	}

}
