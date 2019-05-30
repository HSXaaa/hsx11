package hsx.com.dao;

import java.util.ArrayList;

import hsx.com.entity.GarbageClass;

public interface SearchDao {

	public ArrayList<GarbageClass> searchsetup(String name);

	public int garbagesetup(GarbageClass garbageClass);

}
