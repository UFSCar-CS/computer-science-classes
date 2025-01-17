## Registers used:
##	$t0	- used to hold A.
##	$t1	- used to hold B.
##	$t2	- used to store S, the sentinel value A * B.
##	$t3	- used to store m, the current multiple of A.

	.text
main: 
	## read A into $t0, B into $t1.
	li	$v0, 5		# syscall 5 = read_int
	syscall
	move	$t0, $v0	# A = integer just read
	
	li	$v0, 5		# syscall 5 = read_int
	syscall
	move	$t1, $v0	# B = integer just read.

	blez	$t1, exit	# if B <= 0, exit.

	mul	$t2, $t0, $t1	# S = A * B
	move	$t3, $t0	# m = A

loop:
	move	$a0, $t3	# print m.
	li	$v0, 1		# syscall 1 = print_int
	syscall

	beq	$t2, $t3, endloop	# if m == S, we're done.
	add 	$t3, $t3, $t0		# otherwise, m = m + A.

	la	$a0, space		# print a space.
	li	$v0, 4			# syscall 4 = print_string
	syscall
	
	b	loop			# iterate.

endloop:
	la	$a0, newline		# print a newline:
	li 	$v0, 4			# syscall 4 = print_string
	syscall

exit:					# exit the program:
	li	$v0, 10			# syscall 10 = exit
	syscall				# we're outta here.

## Here's where the data for this program is stored:
	.data
space:		.asciiz " "
newline:	.asciiz "\n"

## end of multiples.asm
