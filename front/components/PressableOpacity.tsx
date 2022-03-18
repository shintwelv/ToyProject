import { Pressable, PressableProps } from 'react-native';

export default function PressableOpacity(props: PressableProps) {
  return (
    <Pressable
      {...props}
      style={({ pressed }) => [
        {
          opacity: pressed ? 0.5 : 1,
        },
      ]}
    />
  );
}
