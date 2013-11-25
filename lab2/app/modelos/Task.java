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

	@Id
	private Long id;
	
	@Required
	private String name;
	
	@Required
	private String description;

	@Required
	private int priority;
	
	@Required
	private boolean status;

	private static Finder<Long, Task> find = new Finder(Long.class, Task.class);

	public static List<Task> all() {
		List<Task> tasks = find.all();
		Collections.sort(tasks);
		return tasks;
	}

	public static void create(Task task) {
		task.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}
	
	public static void updateStatus(Long id) {
		Task task = find.ref(id);
		task.setStatus(true);
		task.update();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public int compareTo(Object o) {
		return this.priority - (((Task)o).priority);
	}


}