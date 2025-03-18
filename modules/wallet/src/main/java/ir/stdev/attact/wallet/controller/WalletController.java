package ir.stdev.attact.wallet.controller;

import ir.stdev.attact.wallet.api.dto.CreateWalletRequest;
import ir.stdev.attact.wallet.api.facade.WalletFacade;
import ir.stdev.attact.wallet.service.api.WalletServiceApi;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
@RequestMapping(path = WalletController.PATH)
@RequiredArgsConstructor
public class WalletController implements WalletFacade {
    private final WalletServiceApi service;

    @Override
    public void createWallet(CreateWalletRequest request) {
        service.createWallet(request);
    }
}
