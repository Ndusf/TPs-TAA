package istic.TAA_TP2.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import istic.TAA_TP2.Jpa.DAO.KanbanDao;
import istic.TAA_TP2.Jpa.Metier.Kanban;

@WebServlet(name="userInfoKanban", urlPatterns={"/UserInfoKanban"})
public class UserInfoKanban extends HttpServlet{
	public void Affichage (HttpServletRequest request,
            HttpServletResponse response)
throws ServletException, IOException {
		
		KanbanDao kanbanDaO = new KanbanDao();

		kanbanDaO.createKanbans();
		
response.setContentType("text/html");

PrintWriter out = response.getWriter();


out.println("<HTML>\n<BODY>\n" +
        "<H1>Recapitulatif des informations</H1>\n" +
        "<UL>\n" +
        " <LI>Prenom: "
        + request.getParameter("nom") + "\n" +
         
        "</UL>\n" +                
        "</BODY></HTML>");

for (Kanban kanban : kanbanDaO.findAll())
{
    out.print("        <tr>\n" + 
            "            <td>" + kanban.getId() + "</td>\n" + 
            "            <td>" + kanban.getNom() + "</td>\n" + 
            "        </tr>");
}

out.print("</table> <br>\n" + 
        "\n" + 
        "    <form action=\"UserInfoKanban\" method=\"post\">\n" + 
        "        <label for=\"name\">Nom du Kanban :</label><br>\n" + 
        "        <input type=\"text\" id=\"name\" name=\"nom\"><br>\n" + 
        "        <input type=\"submit\" value=\"Envoyer\">\n" + 
        "    </form>\n" + 
        "</body>\n" + 
        "\n" + 
        "</html>");
}
	
	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
		Affichage(request, response);
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        KanbanDao kanbanDAO = new KanbanDao();
        kanbanDAO.save(new Kanban(request.getParameter("nom")));
        Affichage(request, response);
    }

	}
