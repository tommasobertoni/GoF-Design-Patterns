package com.gofdp.behavioralpatterns.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class UpdatesManager implements Observer {

	private int _secondsFromLastCheck;
	
	@Override
	public void update(Observable o, Object arg) {
		
		int secondsCounted = (Integer) arg;
		if (secondsCounted - _secondsFromLastCheck > 60)
			if (UpdatesCenter.checkForUpdates())
				System.out.println("New updates found: " + UpdatesCenter.getUpdates());
	}
	
	private static class UpdatesCenter {
		
		private static Random random = new Random(3);
		private static boolean areThereUpdates;
		
		public static boolean checkForUpdates() {
			
			if (!UpdatesCenter.areThereUpdates)
				UpdatesCenter.areThereUpdates = UpdatesCenter.random.nextInt(100) == 0;
			
			return UpdatesCenter.areThereUpdates;
		}
		
		public static List<String> getUpdates() {
			
			UpdatesCenter.areThereUpdates = false;
			
			int updatesCount = UpdatesCenter.random.nextInt(3) + 1;
			List<String> updates = new LinkedList<>();
			for (int i = 0; i < updatesCount; i++)
				updates.add(String.format("%s%s%s",
						    (char)(UpdatesCenter.random.nextInt(26) + 97),
							(char)(UpdatesCenter.random.nextInt(26) + 97),
							(char)(UpdatesCenter.random.nextInt(26) + 97)));
			
			return updates;
		}
	}
}
