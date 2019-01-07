#include "com_jh_mylibrary_NdkString.h"

JNIEXPORT jstring JNICALL Java_com_jh_mylibrary_NdkString_getFromC
  (JNIEnv * env, jclass jclass){
   // return (*env) ->NewStringUTF(env, "FROM C");  // 慕课网这种写法似乎不正确！
    //如果是用C语言格式就用这种方式
   return env->NewStringUTF((char *)"FROM C");
  }