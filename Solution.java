public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas = 0, total_cost = 0;
        int current_gas = 0, start = 0;

        // Calculate total gas and total cost
        for (int i = 0; i < gas.length; i++) {
            total_gas += gas[i];
            total_cost += cost[i];
        }

        // If total gas is less than total cost, it's impossible to complete the circuit
        if (total_gas < total_cost) {
            return -1;
        }

        // Find the starting point using the greedy approach
        for (int i = 0; i < gas.length; i++) {
            current_gas += gas[i] - cost[i];
            // If we run out of gas, reset the starting point to the next station
            if (current_gas < 0) {
                start = i + 1;
                current_gas = 0;
            }
        }

        return start;
    }
}

