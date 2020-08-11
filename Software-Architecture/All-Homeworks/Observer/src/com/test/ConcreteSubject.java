package com.test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ConcreteSubject implements Subject {

	private Vector<Observer> observersVector = new Vector<Observer>();
	
	@Override
	public void attcah(Observer observer) {
		// ��ӹ۲���
		observersVector.addElement(observer);
	}

	@Override
	public void detach(Observer observer) {
		// ɾ���۲���
		observersVector.removeElement(observer);
	}

	@Override
	public void notifyObservers(String s) {
		// ����ȫ���۲���
		
		Iterator<Observer> iterator = observersVector.iterator();
		while (iterator.hasNext()) {
			iterator.next().update(s);
            //System.out.println(iterator.next());
        }

	}

}
