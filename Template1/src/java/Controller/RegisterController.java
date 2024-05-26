/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAL.MailService;
import DAL.UserDAO;
import Model.Account;
import Model.Role;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class RegisterController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //lay ra danh sach cac role
        request.setAttribute("listR", new UserDAO().getRoleList());
        request.getRequestDispatcher("register.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String accName = request.getParameter("accName");
        String fullName = request.getParameter("fullName");
        String dob = request.getParameter("dob");
        String sex = request.getParameter("sex");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        int roleId = Integer.parseInt(request.getParameter("role"));
        Role role = new UserDAO().getRole(roleId);
        Account a = new Account(username, password, accName, fullName, dob, sex, address, phone, email, role);

        request.getSession().setAttribute("newAccount", a);
        boolean check = true;
        if (username.isEmpty() || password.isEmpty() || accName.isEmpty() || fullName.isEmpty() || dob.isEmpty() || sex.isEmpty() || address.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            request.setAttribute("inputEmpty", "Please fill all information");
            check = false;
        }
        if (new UserDAO().getAccountEmail(email) != null) {
            request.setAttribute("mailExist", "Email is exist");
            check = false;
        }
        if (new UserDAO().getAccountUsername(username) != null) {
            request.setAttribute("usernameExist", "Username is exist");
            check = false;
        }
        if (check) {
            Account c = (Account) request.getSession().getAttribute("newAccount");

            new UserDAO().add(c);
            MailService.sendEmail(email, "Happy Programming Verify you Account", "Welcome to Happy Programming\n"
                    + "Please click this link to Verify your account\n"
                    + "http://localhost:9999/Template1/verify");
            request.setAttribute("success", "A link was sent to your email,please verify");

        }

        request.setAttribute("listR", new UserDAO().getRoleList());
        request.getRequestDispatcher("register.jsp").forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
