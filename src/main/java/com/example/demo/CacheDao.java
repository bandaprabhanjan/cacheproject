package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class CacheDao {

	
	public static List<CachePojo> cacheList = new ArrayList<CachePojo>();
	static
	{
		cacheList.add(new CachePojo("1001", "Y"));
		cacheList.add(new CachePojo("1002", "N"));
		cacheList.add(new CachePojo("1003", "Y"));
		cacheList.add(new CachePojo("1004", "Y"));
		
	}
	public List<CachePojo> findbyControlNumber(String controlNumber)
	{
		for(CachePojo cachepojo:cacheList)
		{
			if(cachepojo.getControlNumber()==controlNumber)
			{
				return cacheList;
			}
		}
		return null;
	}
}
