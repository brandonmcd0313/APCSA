using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerProjectile : MonoBehaviour {

	public float speed = 12f;
	
	// Use this for initialization
	void Start()
	{
		//rotate towards mouse position
		Vector3 difference = Camera.main.ScreenToWorldPoint(
			Input.mousePosition) - transform.position;
		difference.Normalize();
		float rotation_z = Mathf.Atan2(difference.y,
			difference.x) * Mathf.Rad2Deg;
		transform.rotation = Quaternion.Euler(0, 0,
			rotation_z);

	}	

		// Update is called once per frame
		void Update() {

			//move forward relative to rotation
			transform.position += transform.right * speed *
				Time.deltaTime;

		//cleanup
		Vector3 pos = Camera.main.WorldToViewportPoint(
			transform.position);
		if (pos.x > 1.1f || pos.x < -0.1f ||
			pos.y > 1.1f || pos.y < -0.1f)
		{
			Destroy(gameObject);
		}

			
		}
	
}

