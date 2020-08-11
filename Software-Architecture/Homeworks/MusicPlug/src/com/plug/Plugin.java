package com.plug;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Plugin {
		private String name;
	    private String jar;
	    private String className;
	    
	    
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getJar() {
	        return jar;
	    }
	    public void setJar(String jar) {
	        this.jar = jar;
	    }
	    public String getClassName() {
	        return className;
	    }
	    public void setClassName(String className) {
	        this.className = className;
	    }
	    
		public IPlayerPlugin getInstance() throws Exception {
			//�õ�jar�����ļ�·��
	        URL[] urls = new URL[1];
	        urls[0] = new URL("file:"+jar);
	        //��̬����jar��
	        ClassLoader loader = new URLClassLoader(urls);
	        // ���ʵ�������󣬲������ʵ��PluginService�ӿ�
	        Class<?> clazz = loader.loadClass(className);
	        //���ز������
	        IPlayerPlugin instance = (IPlayerPlugin)clazz.newInstance();
	 
	        return instance;
	    }
}
