package com.multisdk.library.network.callback;

import com.multisdk.library.network.exception.HttpException;
import com.multisdk.library.network.serializer.CommMessage;

public interface HttpCallback {

  void onSuccess(CommMessage resp);

  void onFailure(HttpException e);

}
