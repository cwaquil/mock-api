package br.com.elementalsource.mock.infra.component;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public interface RequestFormatter {

    String generateLog(final HttpServletRequest request, final Optional<Object> requestBody);

}
