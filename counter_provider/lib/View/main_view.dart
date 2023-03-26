
import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';
import '../ViewModel/BlockViewModel.dart';
import '../View/BoardView.dart';

final counterProvider = StateNotifierProvider<CounterNotifier, int>(
      (ref) => CounterNotifier(),
);

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      home: Home(),
    );
  }
}

class Home extends ConsumerWidget{
  const Home({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context, WidgetRef ref){
    final counterState = ref.watch(counterProvider);
    final counterNotifier = ref.watch(counterProvider.notifier);
    //final List<String> imageList =["a","b","c","d","e","f"];

    return Scaffold(
        appBar: AppBar(
          title: const Text('StateNotifierProvider'),
        ),
        body: SizedBox(
            width: double.infinity,
            child: Column(
                mainAxisAlignment: MainAxisAlignment.start,
                crossAxisAlignment: CrossAxisAlignment.center,
                children:[
                  Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        CustomPaint(
                          // draw Line
                          painter: DrawLine(),
                        ),
                        Container(
                          alignment: Alignment.bottomCenter,
                          height: 780,
                          width: 200,
                          color: Colors.white10,
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children:[
                               IconButton(
                                  onPressed: (){
                                    counterNotifier.plus();
                                  },
                                  icon: const Icon(Icons.add),
                                  iconSize: 30
                              ),
                              IconButton(
                                  alignment: Alignment.bottomCenter,
                                  onPressed: (){
                                    counterNotifier.minus();
                                  },
                                  icon: const Icon(Icons.remove),
                                  iconSize: 30
                              ),
                              Text(
                                counterState.toString(),
                                style: const TextStyle(fontSize: 80),
                              ),
                            ]
                          ),
                        ),
                      ]
                  )
                ]
            )
        )
    );
  }
}