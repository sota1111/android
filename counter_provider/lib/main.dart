import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';

void main() {
  runApp(const ProviderScope(child: MyApp()));
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      home: Home(),
    );
  }
}

class CounterNotifier extends StateNotifier<int>{
  CounterNotifier(): super(0);

  void plus() => state++;
  void minus() => state--;
}

final counterProvider = StateNotifierProvider<CounterNotifier, int>(
  (ref) => CounterNotifier(),
);

class Home extends ConsumerWidget{
  const Home({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context, WidgetRef ref){
    final counterState = ref.watch(counterProvider);
    final counterNotifier = ref.watch(counterProvider.notifier);

    return Scaffold(
      appBar: AppBar(
        title: const Text('StateNotifierProvider'),
      ),
      body: SizedBox(
        width: double.infinity,
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          crossAxisAlignment: CrossAxisAlignment.center,
          children:[
            Text(
              counterState.toString(),
              style: const TextStyle(fontSize: 80),
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                IconButton(
                  onPressed: (){
                    counterNotifier.plus();
                  },
                icon: const Icon(Icons.add),
                iconSize: 30
                ),
                IconButton(
                    onPressed: (){
                      counterNotifier.minus();
                    },
                    icon: const Icon(Icons.remove),
                    iconSize: 30
                ),
              ]
            )
          ]
        )
      )
    );
  }
}

