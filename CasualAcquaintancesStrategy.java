package strategy;

import contactmanagementsoftware.Acquaintances;
import contactmanagementsoftware.CasualAcquaintances;
import contactmanagementsoftware.MUI;

public class CasualAcquaintancesStrategy implements Strategy{

	@Override
	public void setText(Acquaintances acquaintances) {
		// TODO Auto-generated method stub
		MUI mui = MUI.getInstance();
		CasualAcquaintances ca = (CasualAcquaintances)acquaintances;
		mui.one.setText(ca.getWhenWhere());
        mui.two.setVisible(true);
        mui.three.setVisible(true);
        mui.two.setText(ca.getCircumstances());
        mui.three.setText(ca.getOtherInfo());
	}

}
