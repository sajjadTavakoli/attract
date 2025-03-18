package ir.stdev.attact.wallet.api.facade;


import ir.stdev.attact.wallet.api.dto.CreateWalletRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

public interface WalletFacade {

    String PATH = "/wallet";

    @PostMapping(value = "/" , produces = MediaType.APPLICATION_JSON_VALUE)
    void createWallet(CreateWalletRequest request);
}
