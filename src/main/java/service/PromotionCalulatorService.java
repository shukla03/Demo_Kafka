package service;

import entity.HCM;

public class PromotionCalulatorService {

    // Is Eligible for promotion & goalCompletedforCurrentyear

    public boolean isEligibleforpromotionwithGoalCompleted(HCM h) {
        return h.getYearsInCurrentRole() > 3 && h.isEligibleForPromotion() && h.isGoalCompletedForCurrentYear();
    }

    //Is eligible for promotion & ClientappreciationforCurrentyear

    public boolean isEligibleforPromotionwithClientappreciation(HCM hc) {
        return hc.isEligibleForPromotion() && hc.getYearsInCurrentRole() > 3 && hc.isClientAppreciationForCurrentYear();

    }


}
