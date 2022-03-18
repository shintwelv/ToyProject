import { Keyboard, Pressable, StyleSheet, Text, TextInput } from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import PressableOpacity from '../components/PressableOpacity';
import { View } from '../components/Themed';
import { height, width } from '../constants/Layout';

interface landingProps {}

export default function Landing(props: landingProps) {
  return (
    <SafeAreaView>
      <Pressable onPress={Keyboard.dismiss}>
        <View style={styles.container}>
          <Pressable onPress={() => alert('로그인')}></Pressable>
          <Text style={{ fontSize: 30, color: '#000', fontWeight: 'bold' }}>Login</Text>
          <Text
            style={{
              fontSize: 15,
              color: '#000',
              fontWeight: 'normal',
              marginTop: 20,
            }}
          >
            Username:
          </Text>
          <TextInput
            style={{
              fontSize: 15,
              width: '60%',
              height: 40,
              backgroundColor: '#eee',
              paddingHorizontal: 8,
              textAlign: 'center',
              marginTop: 10,
            }}
            maxLength={10}
          />
          <Text
            style={{
              fontSize: 15,
              color: '#000',
              fontWeight: 'normal',
              marginTop: 20,
            }}
          >
            Password:
          </Text>
          <TextInput
            style={{
              fontSize: 15,
              width: '60%',
              height: 40,
              backgroundColor: '#eee',
              paddingHorizontal: 8,
              textAlign: 'center',
              marginTop: 10,
            }}
            maxLength={20}
            secureTextEntry={true}
          />
          <View style={[styles.button, { marginTop: 10 }]}>
            <PressableOpacity>
              <Text style={styles.buttonText}>SIGNIN</Text>
            </PressableOpacity>
          </View>
          <View
            style={{
              marginTop: 10,
              backgroundColor: '#fff',
              alignItems: 'center',
              justifyContent: 'center',
              flexDirection: 'row',
            }}
          >
            <Text style={{ color: '#3D3C38', fontSize: 13 }}>Not a member?&nbsp;</Text>
            <PressableOpacity>
              <Text style={{ color: '#FE4B2B', fontSize: 13 }}>Sign up now</Text>
            </PressableOpacity>
          </View>
        </View>
      </Pressable>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    width: width,
    height: height,
    alignItems: 'center',
    justifyContent: 'center',
    backgroundColor: '#fff',
    paddingHorizontal: 16,
  },
  button: {
    width: '40%',
    height: 40,
    borderRadius: 30,
    backgroundColor: '#FE4B2B',
    alignItems: 'center',
    justifyContent: 'center',
  },
  buttonText: {
    fontSize: 15,
    color: '#fff',
    textAlign: 'center',
    letterSpacing: -0.5,
  },
});
