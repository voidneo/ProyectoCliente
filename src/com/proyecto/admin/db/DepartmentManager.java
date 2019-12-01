package com.proyecto.admin.db;

import java.util.List;

import com.proyecto.admin.lang.BeanNotFoundException;
import com.proyecto.entidades.Departamento;
import com.proyecto.porotos.DepartamentoBeanRemote;

public class DepartmentManager {

	private static DepartamentoBeanRemote getBean() {
		try {
			return BeanManager.get(DepartamentoBeanRemote.class);
		} catch (BeanNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean create(Departamento d) throws Exception {
		return getBean().create(d);
	}

	public static Departamento update(String name, Departamento d) throws Exception {
		return getBean().update(name, d);
	}

	public static Departamento find(String name) throws Exception {
		return getBean().find(name);
	}

	public static List<Departamento> getAll() throws Exception {
		return getBean().getAll();
	}

}
