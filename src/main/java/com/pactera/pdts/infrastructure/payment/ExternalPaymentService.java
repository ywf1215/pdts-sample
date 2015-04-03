package com.pactera.pdts.infrastructure.payment;

import com.pactera.pdts.domain.service.PaymentService;
import com.pactera.pdts.domain.shared.Payment;

public class ExternalPaymentService implements PaymentService {

	@Override
	public int pay(Payment payment) {
		// call third party service here (rmi, restful, webserice etc.)
		return 0;
	}

}
