/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2024-09-17 13:58:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.crimsonlogic.groceriessubbookingsystem.entity.Users;

public final class order_002ddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/MileStone-Project2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/GroceriesSubBookingSystem/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1724994395215L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("com.crimsonlogic.groceriessubbookingsystem.entity.Users");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Order Grocery</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("<style>\r\n");
      out.write(".card {\r\n");
      out.write("	width: 20rem; /* Increased width */\r\n");
      out.write("	padding: 10px; /* Reduce padding */\r\n");
      out.write("	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Add shadow */\r\n");
      out.write("	margin: auto; /* Center the card */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-img-top {\r\n");
      out.write("	height: 150px; /* Increased height */\r\n");
      out.write("	object-fit: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-title {\r\n");
      out.write("	font-size: 1.5rem;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	color: #007bff; /* Blue color */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-text {\r\n");
      out.write("	font-size: 1rem;\r\n");
      out.write("	color: #6c757d; /* Gray color */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".price {\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	color: #28a745; /* Green color */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".stock {\r\n");
      out.write("	color: #dc3545; /* Red color */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".category {\r\n");
      out.write("	font-style: italic;\r\n");
      out.write("	color: #17a2b8; /* Teal color */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".quantity-control {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".quantity-control button {\r\n");
      out.write("	width: 30px;\r\n");
      out.write("	height: 30px;\r\n");
      out.write("	font-size: 1.2rem;\r\n");
      out.write("	line-height: 1;\r\n");
      out.write("	border: none;\r\n");
      out.write("	background-color: #007bff;\r\n");
      out.write("	color: white;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".quantity-control input {\r\n");
      out.write("	width: 50px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	border: 1px solid #ced4da;\r\n");
      out.write("	border-radius: 0.25rem;\r\n");
      out.write("	margin: 0 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text-center {\r\n");
      out.write("	color: #CD5C5C; /* Match the icon color */\r\n");
      out.write("}\r\n");
      out.write("/* Custom Button Styles */\r\n");
      out.write(".btn-primary {\r\n");
      out.write("	background-color: rgba(56, 51, 37, 0.8); /* Custom color */\r\n");
      out.write("	border-color: rgba(56, 51, 37, 0.8); /* Match border color */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-primary:hover {\r\n");
      out.write("	background-color: rgba(56, 51, 37, 1); /* Darker color on hover */\r\n");
      out.write("	border-color: rgba(56, 51, 37, 1); /* Match border color on hover */\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Header Section -->\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/customerHeader.jsp", out, false);
      out.write("\r\n");
      out.write("	<br>\r\n");
      out.write("	<br>\r\n");
      out.write("	<br>\r\n");
      out.write("	<div class=\"container mt-5\">\r\n");
      out.write("		<h1 class=\"mb-4 text-center\">Grocery</h1>\r\n");
      out.write("		<div class=\"card\">\r\n");
      out.write("			<img\r\n");
      out.write("				src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/uploaded/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grocery.imageURL}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("				class=\"card-img-top\" alt=\"Image of ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grocery.groceryName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("			<div class=\"card-body\">\r\n");
      out.write("				<h5 class=\"card-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grocery.groceryName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("				<p class=\"card-text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grocery.description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("				<p class=\"card-text price\">Price: $");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grocery.grocery_price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("				<p class=\"card-text stock\">In Stock: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grocery.in_stock}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("				<p class=\"category\">Category: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grocery.category.category_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("				<form id=\"orderForm\"\r\n");
      out.write("					action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/orders/submit\"\r\n");
      out.write("					method=\"post\">\r\n");
      out.write("					<input type=\"hidden\" name=\"grocery_id\"\r\n");
      out.write("						value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grocery.grocery_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("					");

                        Users user = (Users) request.getSession().getAttribute("user");
                    
      out.write("\r\n");
      out.write("					<input type=\"hidden\" name=\"user_id\"\r\n");
      out.write("						value=\"");
      out.print( user.getUser_id() );
      out.write("\">\r\n");
      out.write("					<p class=\"quantity-display\">Quantity: 1</p>\r\n");
      out.write("					<input type=\"hidden\" name=\"quantity\" value=\"1\">\r\n");
      out.write("					<button type=\"submit\" class=\"btn btn-primary\">Add to Cart</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<br>\r\n");
      out.write("	<br>\r\n");
      out.write("	<br>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/footer.jsp", out, false);
      out.write("\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
