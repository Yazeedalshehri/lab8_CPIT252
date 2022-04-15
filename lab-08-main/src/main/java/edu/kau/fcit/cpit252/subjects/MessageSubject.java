package edu.kau.fcit.cpit252.subjects;
 
import java.util.ArrayList;
import java.util.List;

import edu.kau.fcit.cpit252.observers.Observer;

 
public class MessageSubject implements Subject {
     
	ArrayList<Observer> observer;
	public MessageSubject() {
		observer=new ArrayList<>();
		
	}
  @Override
public void subscribe(Observer o) {
	observer.add(o);
	
}@Override
	public void unsubscribe(Observer o) {
		observer.remove(o);
		
}

@Override
	public void notifyUpdate(String m) {
		for(Observer o: observer)
		{
			o.update(m);
		}
		
	}
}
