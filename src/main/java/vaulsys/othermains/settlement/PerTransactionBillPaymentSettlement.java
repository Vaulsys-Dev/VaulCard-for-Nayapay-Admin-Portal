package vaulsys.othermains.settlement;

import vaulsys.calendar.DateTime;
import vaulsys.calendar.DayTime;
import vaulsys.clearing.ClearingService;
import vaulsys.clearing.base.ClearingProfile;
import vaulsys.clearing.settlement.PerTransactionBillPaymentSettlementServiceImpl;
import vaulsys.persistence.GeneralDao;
import vaulsys.terminal.impl.POSTerminal;
import vaulsys.terminal.impl.Terminal;
import vaulsys.wfe.GlobalContext;
import vaulsys.wfe.ProcessContext;

import java.util.ArrayList;
import java.util.List;

public class PerTransactionBillPaymentSettlement {

	public static void main(String[] args) {
		ClearingProfile clearingProfile = null;
		
		GeneralDao.Instance.beginTransaction();
		try {
			
			GlobalContext.getInstance().startup();
			ProcessContext.get().init();
			clearingProfile = ClearingService.findClearingProfile(170612L);
			GlobalContext.getInstance().getMyInstitution();
			
		} catch (Exception e) {
			e.printStackTrace();
			GeneralDao.Instance.rollback();
			return;
		}

		if (clearingProfile != null) {
			int day = 0;
			int hour = 23;
			if (args.length == 2) {
				day = Integer.parseInt(args[0]);
				hour = Integer.parseInt(args[1]);
			}
			DateTime settleUntilTime = DateTime.beforeNow(Math.abs(day));
			DateTime untilTime = DateTime.now();
			settleUntilTime.setDayTime(new DayTime(hour, 59, 59));
			
			GeneralDao.Instance.endTransaction();
			
			DateTime now = DateTime.now();
			
			try {
				PerTransactionBillPaymentSettlementServiceImpl.Instance.settle(clearingProfile, settleUntilTime, false, true, true);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		System.exit(0);
	}
}