import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';
import '../main.dart';
import '../View/main_view.dart';


class CounterNotifier extends StateNotifier<int>{
  CounterNotifier(): super(0);

  void plus() => state++;
  void minus() => state--;
}

final counterProvider = StateNotifierProvider<CounterNotifier, int>(
      (ref) => CounterNotifier(),
);


