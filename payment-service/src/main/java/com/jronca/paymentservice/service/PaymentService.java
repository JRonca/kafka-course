package com.jronca.paymentservice.service;

import com.jronca.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
