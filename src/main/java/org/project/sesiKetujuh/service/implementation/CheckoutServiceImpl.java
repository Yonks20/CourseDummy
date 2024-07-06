package org.project.sesiKetujuh.service.implementation;

import org.project.sesiKetujuh.model.Address;
import org.project.sesiKetujuh.model.CheckoutRequest;
import org.project.sesiKetujuh.service.CheckoutService;
import org.project.sesiKetujuh.service.PaymentService;

public class CheckoutServiceImpl implements CheckoutService {

    //Bikin constructor untuk memanggil payment service
    private PaymentService paymentService;

    public CheckoutServiceImpl(PaymentService paymentService){
        this.paymentService = paymentService;
    }


    /**
     *  class checkout service akan mewarisi method yang dimiliki CheckoutService
     *     METHOD OVERRIDE
     *      -> Implementasi dari konsep Polymorphism -> Runtime Polymorphism / Polimorfisme
     *      Dinamis
     */


    @Override
    public void process(CheckoutRequest request) {
        //LOGIC
    //requst adalah objeck
        /*
        1. Validasi Alamat
            Cek Apakah alamat tujuan  kosong atau tidak
         */

        boolean isValidateAdress = isValidateAdress(request.getAddress());
        //objek address nilainya didapatkan dari inputan


        /**
         * 2. Memproses Pembayaran
         * panggila paymentService ke CheckoutServiceImpl
         * Kelas interface tidak mengizinkan konstrukctor didalamnya
         */

        String response =  paymentService.paymentProcess(request.getPaymentMethod());
        boolean isPaymentSuccess = isPaymentSuccess(response);
    }

    //METHOD OVERLOADING -> COMPILE TIME POLYMORPHISM (POLIMORFISME STATIK)

    private boolean isValidateAdress(Address address){
        return !address.getDestination().isEmpty();
    }

    private boolean isValidateAdress(String address){
        return !address.isEmpty();
    }

    private boolean isPaymentSuccess(String response){
        return response.equals("success");
    }
}
