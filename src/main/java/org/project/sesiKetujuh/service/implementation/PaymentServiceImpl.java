package org.project.sesiKetujuh.service.implementation;

import org.project.sesiKetujuh.model.PaymentMethod;
import org.project.sesiKetujuh.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public String paymentProcess(PaymentMethod paymentMethod) {
        //logic untuk memproses pembayaran
        //biasanya membatasi waktu transfer
        return "Pembayaran Sukses";
    }
}
