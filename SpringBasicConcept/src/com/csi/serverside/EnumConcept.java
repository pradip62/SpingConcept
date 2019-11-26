/**
 * 
 */
package com.csi.serverside;

public class EnumConcept {

	public enum Days{
		MONDAY, TUESDAY, WEDNESDAY, THURDSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(Days dd: Days.values())
		{
			//System.out.println(dd);
			if(dd.toString().equals("SUNDAY"))
			{
				System.out.println("\n Weekly off");
			}
			else
			{
				System.out.println("\n Working Days");
			}
			
		}
	}

}
