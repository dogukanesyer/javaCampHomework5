package eticaretProject.core.concretes;

import eticaretProject.core.abstracts.ValidatorService;

public class ValidatorManager implements ValidatorService{

	@Override
	public void verificationMail() {
		System.out.println("Doğrulama emaili gönderilmiştir. E-postanızı kontrol ediniz.");
		
	}

}
