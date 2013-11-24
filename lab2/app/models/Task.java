package models;

import java.util.ArrayList;
import java.util.List;

import play.data.validation.Constraints.*;

public class Task {

	public Long id;
	@Required
	public String label;

	public static List<Task> all() {
		return new ArrayList<Task>();
	}

	public static void create(Task task) {
	}

	public static void delete(Long id) {
	}

}