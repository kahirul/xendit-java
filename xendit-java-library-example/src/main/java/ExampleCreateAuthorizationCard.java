import com.xendit.Xendit;
import com.xendit.exception.XenditException;
import com.xendit.model.CreditCard;
import com.xendit.model.CreditCardCharge;

public class ExampleCreateAuthorizationCard {
  public static void main(String[] args) {
    Xendit.apiKey = "xnd_development_...";

    try {
      CreditCardCharge creditCardCharge = CreditCard.createAuthorization("token_id", "external_id", 75000, "auth_id", "123", false);
      System.out.println(creditCardCharge.getId());
    } catch (XenditException e) {
      e.printStackTrace();
    }
  }
}
