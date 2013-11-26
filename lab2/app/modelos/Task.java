package modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import play.data.validation.Constraints.*;
import javax.persistence.*;
import play.db.ebean.*;

@Entity
public class Task extends Model implements Comparable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**O id da task**/
	@Id
	private Long id;
	/**Nome da task**/
	@Required
	private String name;
	/**Descrição da task**/
	@Required
	private String description;
	/**Prioridade da task**/
	@Required
	private int priority;
	/**Task realizada ou não**/
	@Required
	private boolean status;
	/**procura task**/
	private static Finder<Long, Task> find = new Finder(Long.class, Task.class);

	/**
	 * lista todas as tasks
	 * @return lista de Task
	 */
	public static List<Task> all() {
		List<Task> tasks = find.all();
		Collections.sort(tasks);
		return tasks;
	}

	/**
	 * Cria uma nova task
	 * @param task
	 */
	public static void create(Task task) {
		task.save();
	}

	/**
	 * Deleta uma task
	 * @param id
	 */
	public static void delete(Long id) {
		find.ref(id).delete();
	}
	
	/**
	 * Atualiza o status da task
	 * @param id
	 */
	public static void updateStatus(Long id) {
		Task task = find.ref(id);
		task.setStatus(true);
		task.update();
		
	}
	
	/**
	 * @return o id da tas
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Modifica o id da task
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @return o nome da task
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Modifica o nome da task
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return a descrição da task
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Modifica a desscrição da task
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * @return o grau de prioridade da task
	 */
	public int getPriority() {
		return priority;
	}
	
	/**
	 * Modifica o grau de prioridade
	 * @param priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	/**
	 * @return O status da task
	 */
	public boolean isStatus() {
		return status;
	}
	
	/**
	 * Modifica o status da task
	 * @param status
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	/**
	 * Compara o grau de prioridade das tasks
	 */
	@Override
	public int compareTo(Object o) {
		return this.priority - (((Task)o).priority);
	}


}