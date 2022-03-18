import { TextStyle } from "react-native";
import { Text, TextProps } from "./Themed";

export function MonoText(props: TextProps) {
  return <Text {...props} style={props.style} />;
}

export function TextRegular(props: TextProps) {
  return (
    <Text {...props} style={[{ fontFamily: "NotoSansRegular" }, props.style]} />
  );
}
export function TextBold(props: TextProps) {
  return (
    <Text {...props} style={[{ fontFamily: "NotoSansBold" }, props.style]} />
  );
}
export function TextMedium(props: TextProps) {
  return (
    <Text {...props} style={[{ fontFamily: "NotoSansMedium" }, props.style]} />
  );
}
