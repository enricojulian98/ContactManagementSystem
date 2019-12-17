package strategy;

import contactmanagementsoftware.Acquaintances;
import contactmanagementsoftware.MUI;
import contactmanagementsoftware.ProfessionalFriends;

public class ProfessionalFriendsStrategy implements Strategy{

	@Override
	public void setText(Acquaintances acquaintances) {
		// TODO Auto-generated method stub
		MUI mui = MUI.getInstance();
		ProfessionalFriends proF = (ProfessionalFriends)acquaintances;
		mui.one.setText(proF.getCommonInterests());
	}

}
