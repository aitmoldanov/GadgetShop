package com.Filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/AdminGenericFilter")
public class AdminGenericFilter implements Filter {
	private FilterConfig filterconfg = null;
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, response);
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		this.filterconfg = fConfig;
	}
	
   public FilterConfig getFilterconfg() {
		return filterconfg;
	}

	public void setFilterconfg(FilterConfig filterconfg) {
		this.filterconfg = filterconfg;
	}

	public void destroy() {
		this.filterconfg = null;
	}

	

	

}
