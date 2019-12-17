package strategy;

import contactmanagementsoftware.Acquaintances;
import contactmanagementsoftware.MUI;
import contactmanagementsoftware.PersonalFriends;
import contactmanagementsoftware.Relatives;

public class RelativesStrategy implements Strategy{

	@Override
	public void setText(Acquaintances acquaintances) {
		// TODO Auto-generated method stub
		MUI mui = MUI.getInstance();
		Relatives rel = (Relatives)acquaintances;
        mui.one.setText(rel.getBDate());
        mui.two.setText(rel.getLDate());
	}

}
