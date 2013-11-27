package controllers;

import java.util.List;

import modelos.Task;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
	static Form<Task> taskForm = Form.form(Task.class);

	/**
	 * Ação para a rota
	**/
	public static Result index() {
		return redirect(routes.Application.tasks());
	}

	/**
	 * Ação da página inicial
	 * @return
	 */
	public static Result tasks() {
		return ok(views.html.index.render(Task.all(), taskForm));
	}
	
	/**
	 * Ação de cadastro de novas atividades
	 * @return
	 */
	public static Result newTask() {
		Form<Task> filledForm = taskForm.bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.index.render(Task.all(), filledForm));
		} else {
			Task.create(filledForm.get());
			return redirect(routes.Application.tasks());
		}
	}

	/**
	 * Ação de remover uma determinada atividade
	 * @param id
	 * @return
	 */
	public static Result deleteTask(Long id) {
		  Task.delete(id);
		  return redirect(routes.Application.tasks());
		}
	
	/**
	 * Ação de atualizar o status da atividade
	 * @param id
	 * @return
	 */
	public static Result updateTask(Long id) {
		Task.updateStatus(id);
		return redirect(routes.Application.tasks());
	}

}
