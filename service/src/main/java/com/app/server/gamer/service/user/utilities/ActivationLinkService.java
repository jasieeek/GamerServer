package com.app.server.gamer.service.user.utilities;

public interface ActivationLinkService {
    String generateLink();
    void associateLinkWithUser();
    void deleteLinkAfterActivation();
}
