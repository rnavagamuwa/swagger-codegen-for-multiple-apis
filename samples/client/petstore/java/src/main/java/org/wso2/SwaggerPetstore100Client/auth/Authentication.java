package org.wso2.SwaggerPetstore100Client.auth;

import org.wso2.SwaggerPetstore100Client.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
