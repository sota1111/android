import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';

final helloWorldProvider = Provider((ref) => 'Hello World');

void main(){
  runApp(
    ProviderScope(
      child: MaterialApp(
        title: 'Flutter Demo',
        home: MyApp(),
      )
    )
  );
}

class MyApp extends ConsumerWidget{
  @override
  Widget build(BuildContext context, ScopedReader watch){
    // watch()を使いデータを受け取る
    // 値は.stateに格納
    final count = watch(countProvider).state;
    return Scaffold(
      body: Center(
        child:Text('count is $count'),
      ),
    );
  }
}