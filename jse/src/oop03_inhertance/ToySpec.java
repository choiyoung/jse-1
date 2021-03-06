package oop03_inhertance;

import java.util.HashMap;
import java.util.Map;

public class ToySpec {
	private Map<String, Object> properties;

	public ToySpec() {
		properties = new HashMap<String, Object>();
	}

	public Map<String, Object> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}
	//맵에 키값, 속성값 추가
	public  void setProperty(String pName,Object pValue){
		properties.put(pName, pValue);
	}
	//키값에 따라서 속성값 불러오기
	public Object getProperty(String pname){
		return properties.get(pname);
	}
	//비교 검색 
	public boolean match(ToySpec spec){
		String specStr = "";
		String thisStr ="";
		
		if(spec.getProperty("ToyUser")!=null ){
			specStr +=spec.getProperty("ToyUser");
			thisStr +=getProperty("ToyUser");
		}
		if(spec.getProperty("ToyUser")!=null ){
			specStr +=spec.getProperty("ToyUser");
			thisStr +=getProperty("ToyType");
		}
		
		return spec.equals(thisStr);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return properties.toString();
	}
}
