package br.com.elementalsource.mock.configuration.service;

import br.com.elementalsource.mock.configuration.model.CaptureState;

import java.util.Optional;

public interface CaptureStateService {
    Optional<CaptureState> getCurrent();

    CaptureState enable();

    void delete();

}
