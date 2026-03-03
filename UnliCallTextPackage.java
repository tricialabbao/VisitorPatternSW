public class UnliCallTextPackage implements UnliCallsTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (unliCallText) {
            return telcoName + " includes unlimited calls and texts in their plan.";
        } else {
            return telcoName + " does NOT include unlimited calls and texts. Charges apply per use.";
        }
    }
}