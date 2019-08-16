package pro.truongsinh.appium_flutter

fun byValueKey(input: String): String {
  val base64Encoded = serialize(hashMapOf(
    "finderType" to "ByValueKey",
    "keyValueType" to "String",
    "keyValueString" to input
    ))
  return base64Encoded
}

fun byValueKey(input: Int): String {
  val base64Encoded = serialize(hashMapOf(
    "finderType" to "ByValueKey",
    "keyValueType" to "int",
    "keyValueString" to input
    ))
  return base64Encoded
}