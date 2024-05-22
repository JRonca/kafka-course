package com.jronca.paymentservice.service.impl;

import com.jronca.paymentservice.model.Payment;
import com.jronca.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT SERVICE IMPL ::: Recebi o pagamento {}", payment);
    }
}
