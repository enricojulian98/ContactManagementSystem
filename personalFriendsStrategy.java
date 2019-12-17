package strategy;

import contactmanagementsoftware.Acquaintances;
import contactmanagementsoftware.MUI;
import contactmanagementsoftware.PersonalFriends;

public class personalFriendsStrategy implements Strategy{

	
	

	@Override
	public void setText(Acquaintances acquaintances) {
		// TODO Auto-generated method stub
		MUI mui = MUI.getInstance();
		PersonalFriends perF = (PersonalFriends)acquaintances;
		 mui.one.setText(perF.getEvents());
	     mui.two.setText(perF.getAContext());
	     mui.three.setText(perF.getADate());
	}
        
}
