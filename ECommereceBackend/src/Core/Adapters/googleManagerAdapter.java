package Core.Adapters;

import Core.Google.googleAuthentication;

public class googleManagerAdapter implements googleService {

	@Override
	public void register(String Mail, String username) {
		// TODO Auto-generated method stub
		googleAuthentication googleKayit = new googleAuthentication();

		googleKayit.signUp(Mail, username);
	}

}
