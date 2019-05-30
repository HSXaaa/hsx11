package hsx.com.service;

import java.util.ArrayList;

import hsx.com.entity.GarbageClass;

public interface SearchService {

	public ArrayList<GarbageClass> searchset(String name);

	public int garbageset(GarbageClass garbageClass);

}
